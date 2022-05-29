package apcs;

import javax.swing.*;
//this method returns the correct png it is quit eliteraly just a hoard of if and elses, probably should have used switchcase.
public class textgetter {
    public textgetter(){
    }
    // it returns a image icon which will be the one that get displayed on what ever function uses it, it goes throu every letter, dependeing on if it got it right ,wrong, or its in the word
    // it does this by using substring by getting it from the parameters.
    public ImageIcon Gettext(int count, String word, int test){
        String temp = word.substring(count, count + 1);
        temp.toLowerCase();
        if(test == 0) {
            if (temp.equals("a") || temp.equals("A")) {
                return new ImageIcon(getClass().getResource("emptyA.png"));
            }
            if (temp.equals("b") || temp.equals("B")) {
                return new ImageIcon(getClass().getResource("emptyB.png"));
            }
            if (temp.equals("c") || temp.equals("C")) {
                return new ImageIcon(getClass().getResource("emptyC.png"));
            }
            if (temp.equals("d") || temp.equals("D")) {
                return new ImageIcon(getClass().getResource("emptyD.png"));
            }
            if (temp.equals("e") || temp.equals("E")) {
                return new ImageIcon(getClass().getResource("emptyE.png"));
            }
            if (temp.equals("f") || temp.equals("F")) {
                return new ImageIcon(getClass().getResource("emptyF.png"));
            }
            if (temp.equals("g") || temp.equals("G")) {
                return new ImageIcon(getClass().getResource("emptyG.png"));
            }
            if (temp.equals("h") || temp.equals("H")) {
                return new ImageIcon(getClass().getResource("emptyH.png"));
            }
            if (temp.equals("i") || temp.equals("I")) {
                return new ImageIcon(getClass().getResource("emptyI.png"));
            }
            if (temp.equals("j") || temp.equals("J")) {
                return new ImageIcon(getClass().getResource("emptyJ.png"));
            }
            if (temp.equals("k") || temp.equals("K")) {
                return new ImageIcon(getClass().getResource("emptyK.png"));
            }
            if (temp.equals("l") || temp.equals("L")) {
                return new ImageIcon(getClass().getResource("emptyL.png"));
            }
            if (temp.equals("m") || temp.equals("M")) {
                return new ImageIcon(getClass().getResource("emptyM.png"));
            }
            if (temp.equals("n") || temp.equals("N")) {
                return new ImageIcon(getClass().getResource("emptyN.png"));
            }
            if (temp.equals("o") || temp.equals("O")) {
                return new ImageIcon(getClass().getResource("emptyO.png"));
            }
            if (temp.equals("p") || temp.equals("P")) {
                return new ImageIcon(getClass().getResource("emptyP.png"));
            }
            if (temp.equals("q") || temp.equals("Q")) {
                return new ImageIcon(getClass().getResource("emptyQ.png"));
            }
            if (temp.equals("r") || temp.equals("R")) {
                return new ImageIcon(getClass().getResource("emptyR.png"));
            }
            if (temp.equals("s") || temp.equals("S")) {
                return new ImageIcon(getClass().getResource("emptyS.png"));
            }
            if (temp.equals("t") || temp.equals("T")) {
                return new ImageIcon(getClass().getResource("emptyT.png"));
            }
            if (temp.equals("u") || temp.equals("U")) {
                return new ImageIcon(getClass().getResource("emptyU.png"));
            }
            if (temp.equals("v") || temp.equals("V")) {
                return new ImageIcon(getClass().getResource("emptyV.png"));
            }
            if (temp.equals("w") || temp.equals("W")) {
                return new ImageIcon(getClass().getResource("emptyW.png"));
            }
            if (temp.equals("x") || temp.equals("X")) {
                return new ImageIcon(getClass().getResource("emptyX.png"));
            }
            if (temp.equals("y") || temp.equals("Y")) {
                return new ImageIcon(getClass().getResource("emptyY.png"));
            }
            if (temp.equals("z") || temp.equals("Z")) {
                return new ImageIcon(getClass().getResource("emptyZ.png"));
            }
        }
        if(test == 1) {
            if (temp.equals("a") || temp.equals("A")) {
                return new ImageIcon(getClass().getResource("rightA.png"));
            }
            if (temp.equals("b") || temp.equals("B")) {
                return new ImageIcon(getClass().getResource("rightB.png"));
            }
            if (temp.equals("c") || temp.equals("C")) {
                return new ImageIcon(getClass().getResource("rightC.png"));
            }
            if (temp.equals("d") || temp.equals("D")) {
                return new ImageIcon(getClass().getResource("rightD.png"));
            }
            if (temp.equals("e") || temp.equals("E")) {
                return new ImageIcon(getClass().getResource("rightE.png"));
            }
            if (temp.equals("f") || temp.equals("F")) {
                return new ImageIcon(getClass().getResource("rightF.png"));
            }
            if (temp.equals("g") || temp.equals("G")) {
                return new ImageIcon(getClass().getResource("rightG.png"));
            }
            if (temp.equals("h") || temp.equals("H")) {
                return new ImageIcon(getClass().getResource("rightH.png"));
            }
            if (temp.equals("i") || temp.equals("I")) {
                return new ImageIcon(getClass().getResource("rightI.png"));
            }
            if (temp.equals("j") || temp.equals("J")) {
                return new ImageIcon(getClass().getResource("rightJ.png"));
            }
            if (temp.equals("k") || temp.equals("K")) {
                return new ImageIcon(getClass().getResource("rightK.png"));
            }
            if (temp.equals("l") || temp.equals("L")) {
                return new ImageIcon(getClass().getResource("rightL.png"));
            }
            if (temp.equals("m") || temp.equals("M")) {
                return new ImageIcon(getClass().getResource("rightM.png"));
            }
            if (temp.equals("n") || temp.equals("N")) {
                return new ImageIcon(getClass().getResource("rightN.png"));
            }
            if (temp.equals("o") || temp.equals("O")) {
                return new ImageIcon(getClass().getResource("rightO.png"));
            }
            if (temp.equals("p") || temp.equals("P")) {
                return new ImageIcon(getClass().getResource("rightP.png"));
            }
            if (temp.equals("q") || temp.equals("Q")) {
                return new ImageIcon(getClass().getResource("rightQ.png"));
            }
            if (temp.equals("r") || temp.equals("R")) {
                return new ImageIcon(getClass().getResource("rightR.png"));
            }
            if (temp.equals("s") || temp.equals("S")) {
                return new ImageIcon(getClass().getResource("rightS.png"));
            }
            if (temp.equals("t") || temp.equals("T")) {
                return new ImageIcon(getClass().getResource("rightT.png"));
            }
            if (temp.equals("u") || temp.equals("U")) {
                return new ImageIcon(getClass().getResource("rightU.png"));
            }
            if (temp.equals("v") || temp.equals("V")) {
                return new ImageIcon(getClass().getResource("rightV.png"));
            }
            if (temp.equals("w") || temp.equals("W")) {
                return new ImageIcon(getClass().getResource("rightW.png"));
            }
            if (temp.equals("x") || temp.equals("X")) {
                return new ImageIcon(getClass().getResource("rightX.png"));
            }
            if (temp.equals("y") || temp.equals("Y")) {
                return new ImageIcon(getClass().getResource("rightY.png"));
            }
            if (temp.equals("z") || temp.equals("Z")) {
                return new ImageIcon(getClass().getResource("rightZ.png"));
            }
        }
        if(test == 2) {
            if (temp.equals("a") || temp.equals("A")) {
                return new ImageIcon(getClass().getResource("semiA.png"));
            }
            if (temp.equals("b") || temp.equals("B")) {
                return new ImageIcon(getClass().getResource("semiB.png"));
            }
            if (temp.equals("c") || temp.equals("C")) {
                return new ImageIcon(getClass().getResource("semiC.png"));
            }
            if (temp.equals("d") || temp.equals("D")) {
                return new ImageIcon(getClass().getResource("semiD.png"));
            }
            if (temp.equals("e") || temp.equals("E")) {
                return new ImageIcon(getClass().getResource("semiE.png"));
            }
            if (temp.equals("f") || temp.equals("F")) {
                return new ImageIcon(getClass().getResource("semiF.png"));
            }
            if (temp.equals("g") || temp.equals("G")) {
                return new ImageIcon(getClass().getResource("semiG.png"));
            }
            if (temp.equals("h") || temp.equals("H")) {
                return new ImageIcon(getClass().getResource("semiH.png"));
            }
            if (temp.equals("i") || temp.equals("I")) {
                return new ImageIcon(getClass().getResource("semiI.png"));
            }
            if (temp.equals("j") || temp.equals("J")) {
                return new ImageIcon(getClass().getResource("semiJ.png"));
            }
            if (temp.equals("k") || temp.equals("K")) {
                return new ImageIcon(getClass().getResource("semiK.png"));
            }
            if (temp.equals("l") || temp.equals("L")) {
                return new ImageIcon(getClass().getResource("semiL.png"));
            }
            if (temp.equals("m") || temp.equals("M")) {
                return new ImageIcon(getClass().getResource("semiM.png"));
            }
            if (temp.equals("n") || temp.equals("N")) {
                return new ImageIcon(getClass().getResource("semiN.png"));
            }
            if (temp.equals("o") || temp.equals("O")) {
                return new ImageIcon(getClass().getResource("semiO.png"));
            }
            if (temp.equals("p") || temp.equals("P")) {
                return new ImageIcon(getClass().getResource("semiP.png"));
            }
            if (temp.equals("q") || temp.equals("Q")) {
                return new ImageIcon(getClass().getResource("semiQ.png"));
            }
            if (temp.equals("r") || temp.equals("R")) {
                return new ImageIcon(getClass().getResource("semiR.png"));
            }
            if (temp.equals("s") || temp.equals("S")) {
                return new ImageIcon(getClass().getResource("semiS.png"));
            }
            if (temp.equals("t") || temp.equals("T")) {
                return new ImageIcon(getClass().getResource("semiT.png"));
            }
            if (temp.equals("u") || temp.equals("U")) {
                return new ImageIcon(getClass().getResource("semiU.png"));
            }
            if (temp.equals("v") || temp.equals("V")) {
                return new ImageIcon(getClass().getResource("semiV.png"));
            }
            if (temp.equals("w") || temp.equals("W")) {
                return new ImageIcon(getClass().getResource("semiW.png"));
            }
            if (temp.equals("x") || temp.equals("X")) {
                return new ImageIcon(getClass().getResource("semiX.png"));
            }
            if (temp.equals("y") || temp.equals("Y")) {
                return new ImageIcon(getClass().getResource("semiY.png"));
            }
            if (temp.equals("z") || temp.equals("Z")) {
                return new ImageIcon(getClass().getResource("semiZ.png"));
            }
        }


    return null;
    }



}
