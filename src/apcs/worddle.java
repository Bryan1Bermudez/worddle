package apcs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//the actual game, this controls the display, gathers the inputs, and calls upon other functions to play worddle.
public class worddle {

    private JFrame Board;
    private JLabel[][] squares;
    private JPanel game;
    private JButton check;
    private JButton cheat;
    private JButton reset;
    private int count;
    String word;
    private textgetter text;
    private ImageIcon empty = new ImageIcon(getClass().getResource("empty.png"));
    private wordGenerator gen;
    //sets all the varibles to represent the buttons the board ,etc,etc  in the for loop it fills out all of the tiles.
    public worddle(){
        gen = new wordGenerator();
        cheat = new JButton("cheat");
        count = 0;
        text = new textgetter();
        check = new JButton("enter");
        reset = new JButton("Reset word");
        Board = new JFrame();
        Board.setLayout(new GridLayout(1,1));
        Board.setSize( 500, 700);
        Board.setLocation(0,0);
        Board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        squares = new JLabel[6][5];
        for(int R = 0; R < squares.length; R++){
            for (int C = 0; C < squares[R].length; C++){
                    squares[R][C] = new JLabel(empty);

            }
        }

        game = new JPanel(new GridLayout(7,5,5,5));
        game.setSize(1500,1500);
        Board.setResizable(false);




    }
    // this plays after the end of a game in which it completly restarts the game reseting all the varibles and chosing a new word
    public void restart(int a){
        if( a ==1){
            gen = gen;
        }
        else {
            gen = new wordGenerator();
        }
        count = 0;
        text = new textgetter();
        check = new JButton("enter");
        cheat = new JButton("cheat");
        reset = new JButton("Reset word");
        Board = new JFrame();
        Board.setLayout(new GridLayout(1,1));
        Board.setSize( 500, 700);
        Board.setLocation(0,0);
        Board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        squares = new JLabel[6][5];
        for(int R = 0; R < squares.length; R++){
            for (int C = 0; C < squares[R].length; C++){
                squares[R][C] = new JLabel(empty);

            }
        }

        game = new JPanel(new GridLayout(7,5,5,5));
        game.setSize(1500,1500);
        Board.setResizable(false);
        start();










    }
    //starts the game and plays it is what deterimens what the buttons do. and then adds it to the board meaning they are now displayed
    public void start(){
        for (JLabel[] arr : squares) {
            for (JLabel lab : arr) {
                game.add(lab);
                game.repaint();
            }
        }
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { ;
                word = display.input("can only be 5 letters");
                if(word.length() > 5 || word.length() < 5){
                    display.msg("sorry that dosent work");
                }
                else {
                    Board.setVisible(false);
                    Redraw();

                }

            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board.dispose();
                restart(0);
            }
        });
        cheat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a = display.yN("Are you sure you want to cheat and get the awnsers?","cheat");
               if(a == 0){
                   String temp = "";
                   for(int i = 0; i < gen.getPossible_words().length ; i ++){
                       temp = temp + gen.getPossible_words()[i] + "  ";
                   }
                   display.msg("the possible words are " + temp);
                   display.msg("the current word is " + gen.getChosenWord());

               }


            }
        });
        game.add(check);
        game.add(new JLabel( "number of tries"));
        game.add(new JLabel( count + " "));
        game.add(cheat);
        game.add(reset);
        game.repaint();
        Board.add(game).setLocation(1,0);
        Board.setVisible(true);

    }
    // redraws the board after every button click and forms the actual change you see on screen it also deterimens when you lose and when you win and shows the corosponding message
    public void Redraw(){
        Board.remove(game);
        Board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Changelabel();
        game = new JPanel(new GridLayout(7,5,5,5));
        game.setSize(1500,1600);
        for (JLabel[] arr : squares) {
            for (JLabel lab : arr) {
                game.add(lab);
                game.repaint();
            }
        }
        game.add(check);
        game.add(new JLabel( "number of tries"));
        game.add(new JLabel( count + " "));
        game.add(cheat);
        game.add(reset);
        game.repaint();
        Board.add(game).setLocation(1,0);
        Board.setVisible(true);
        if( gen.iscomplete(word)){
            display.msg("Congrats!! you guessed the word in " + count + " tries!! now the game will restart with a new word");
            Board.dispose();
            restart(0);
        }
        else if(count == 6){
            int a = display.yN("you lost do you want to try again with a new word or keep the old one? , yes for new word, no for old word","try again?");
            Board.dispose();
            restart(a);



        }











    }
    //just changes the labels in each box is what determines what the row of boxes display

    public void Changelabel(){


        for(int c = 0; c< squares[count].length; c ++){

            squares[count][c] = new JLabel(text.Gettext(c,word,gen.check(word,c)));
        }
        count ++;



    }









}
