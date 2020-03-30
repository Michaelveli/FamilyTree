import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class IceAndFire {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList();
        Scanner input = new Scanner (new File("/home/michaelveli/2670/HW4/Set04/names.txt"));
        while (input.hasNext()){
            String next = input.nextLine();
            list.add(next);
        } //while loop adds every name to array list
        Collections.sort(list); //sorts list alphabetically
        System.out.println(list); //delete

        System.out.print("Please enter a name: ");
        Scanner in = new Scanner(System.in); //scanner for user input
        String s = in.nextLine().toLowerCase(); //gets the name the user enters

        //switch takes the name the user give and outputs relevant index numbers from the array list
        switch (s){
            case "aegon" : {
                System.out.println("Also known by Jon Snow");
                System.out.println("Mother: " + list.get(14));
                System.out.println("Father: " + list.get(20));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: (Starks) " + list.get(24) + "," + list.get(26) + "," + list.get(3) + "," + list.get(5) +"," + list.get(24));
                System.out.println("Children: N/A");
                break;
            }
            case "aegon v": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(15));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(9) + "," + list.get(21));
                break;

            }
            case "aerys ii": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(9));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(20) + "," + list.get(33) + "," +list.get(7));
                break;

            }
            case "arya": {
                System.out.println("Mother: Catelyn");
                System.out.println("Father: " + list.get(8));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " +list.get(24) + "," +list.get(26) +"," + list.get(5) +"," + list.get(23) + "," + list.get(13));
                System.out.println("Children: " + list.get(29));
                break;

            }
            case "benjen": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(22));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: "+list.get(8));
                System.out.println("Children: N/A");
                break;

            }
            case "brandon": {
                System.out.println("Brandon I or Brandon II (Bran) ?");
                String z = in.nextLine().toLowerCase();
                //given family tree had the name Brandon for two people, below code will seperate the two

                switch (z) {
                    case "brandon i": {
                        System.out.println("Mother: N/A");
                        System.out.println("Father: N/A");
                        System.out.println("Spouse: " + list.get(11));
                        System.out.println("Siblings: N/A");
                        System.out.println("Children: " + list.get(10) + "," + list.get(6) + "," + list.get(31));
                        break;
                    }
                    case "brandon ii":
                    case "bran": {
                        System.out.println("Mother: Catelyn");
                        System.out.println("Father: " + list.get(8));
                        System.out.println("Spouse: N/A");
                        System.out.println("Siblings: " +list.get(24) + "," +list.get(26) +"," + list.get(3) +"," + list.get(23) + "," + list.get(13));
                        System.out.println("Children: " + list.get(29));
                        break;
                    }
                }
                break;
            }
            case "cersei": {
                System.out.println("Mother: "  + list.get(11));
                System.out.println("Father:  " + list.get(32));
                System.out.println("Spouse: " + list.get(25));
                System.out.println("Siblings: " + list.get(10) + "," + list.get(31));
                System.out.println("Children: " + list.get(12) + "," + list.get(17) + "," + list.get(30));
                break;
            }
            case "daenerys" : {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(2));
                System.out.println("Spouse: " + list.get(21));
                System.out.println("Siblings: " + list.get(33) + "," + list.get(20));
                System.out.println("Children: N/A");
                break;
            }
            case "eddard": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(22));
                System.out.println("Spouse: Catelyn");
                System.out.println("Siblings: " + list.get(4) +"," + list.get(5) + "," + list.get(14));
                System.out.println("Children: " + list.get(24) + "," + list.get(26) + "," + list.get(3) + "," + list.get(5) + "," + list.get(23) + "," +"(Bastard) " + list.get(13));
                break;
            }
            case "jaeharys ii": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(1));
                System.out.println("Spouse: " + list.get(21));
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(2));
                break;

            }
            case "jaime": {
                System.out.println("Mother: " + list.get(11));
                System.out.println("Father: " + list.get(32));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(6) + "," + list.get(31));
                System.out.println("Children: " + list.get(12) + "," + list.get(17) + "," + list.get(30));
                break;
            }
            case "joanna": {
                System.out.println("Mother: N/A");
                System.out.println("Father: N/A");
                System.out.println("Spouse: " + list.get(32));
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(10) + "," + list.get(6) + "," + list.get(31));
                break;

            }
            case "joffrey": {
                System.out.println("Mother: " + list.get(6));
                System.out.println("Father: " + list.get(10));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: N/A");
                break;

            }
            case "jon": {
                System.out.println("Also known by Aegon Targaryen");
                System.out.println("Mother: " + list.get(14));
                System.out.println("Father: " + list.get(20));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: (Starks) " + list.get(24) + "," + list.get(26) + "," + list.get(3) + "," + list.get(5) +"," + list.get(24));
                System.out.println("Children: N/A");
                break;

            }
            case "lyanna": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(22));
                System.out.println("Spouse: (Briefly) "+  list.get(20));
                System.out.println("Siblings: " + list.get(5) + "," + list.get(8) + "," + list.get(14));
                System.out.println("Children: " + list.get(0));
                break;

            }
            case "maekar i": {
                System.out.println("Mother: N/A");
                System.out.println("Father: N/A");
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(16) + "," + list.get(1));
                break;

            }
            case "maeser aemon": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(15));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(1));
                System.out.println("Children: N/A");
                break;
            }
            case "myrcella": {
                System.out.println("Mother: " + list.get(6));
                System.out.println("Father: " + list.get(10));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings:  " + list.get(12) + "," + list.get(30));
                System.out.println("Children: N/A");
                break;

            }
            case "ormund": {
                System.out.println("Mother: N/A");
                System.out.println("Father: N/A");
                System.out.println("Spouse: " + list.get(21));
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(29));
                break;
            }
            case "renly": {
                System.out.println("Mother: N/A");
                System.out.println("Father:  " + list.get(29));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings:  " + list.get(25) + "," + list.get(28));
                System.out.println("Children: N/A");
                break;
            }
            case "rhaegar": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(2));
                System.out.println("Spouse: (Briefly) "+  list.get(14));
                System.out.println("Siblings: " + list.get(33) + "," + list.get(7));
                System.out.println("Children: " + list.get(0));
                break;

            }

            case "rhaelle": {System.out.println("Mother: N/A");
                              System.out.println("Father: " + list.get(1));
                              System.out.println("Spouse: " + list.get(19));
                              System.out.println("Children: " + list.get(31));
                              break;
            }
            case "rickard": {
                System.out.println("Mother: N/A");
                System.out.println("Father: N/A");
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(5) + "," + list.get(8) + "," + list.get(4) + "," + list.get(14));
                break;
            }
            case "rickon": {
                System.out.println("Mother: Catelyn");
                System.out.println("Father: " + list.get(8));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(24) + "," + list.get(26) + "," + list.get(3) + "," + list.get(5) + "," + list.get(13));
                System.out.println("Children: N/A");
                break;
            }
            case "robb": {
                System.out.println("Mother: Catelyn");
                System.out.println("Father: " + list.get(8));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(23) + "," + list.get(26) + "," + list.get(3) + "," + list.get(5) + "," + list.get(13));
                System.out.println("Children: N/A");
                break;
            }
            case "robert": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(29));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(28) + ","  + list.get(19));
                System.out.println("Children: Joffrey, Mrycella, Tommen (Legal parent, not biological)");
                break;
            }
            case "sansa": {
                System.out.println("Mother: Catelyn");
                System.out.println("Father: " + list.get(8));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(3) + "," + list.get(5) + "," + list.get(23) + "," + list.get(24) + "," + list.get(13));
                System.out.println("Children: N/A");
                break;

            }
            case "shireen": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(28));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: N/A");
                break;

            }
            case "stannis": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(29));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(25) + "," + list.get(19));
                System.out.println("Children: " + list.get(27));
                break;
            }


            case "steffon": {
                System.out.println("Mother: " + list.get(21));
                System.out.println("Father: " + list.get(18));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: " +list.get(25) + "," + list.get(28) + "," + list.get(19));
                break;
            }
            case "tommen": {
                System.out.println("Mother: " + list.get(6));
                System.out.println("Father: " + list.get(10));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(12) + "." + list.get(17));
                System.out.println("Children: N/A");
                break;
            }
            case "tyrion": {
                System.out.println("Mother: " + list.get(11));
                System.out.println("Father: " + list.get(32));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: " + list.get(6) + "," + list.get(10));
                System.out.println("Children: N/A");
                break;
            }
            case "tywin": {
                System.out.println("Mother: N/A");
                System.out.println("Father: N/A");
                System.out.println("Spouse: " + list.get(11));
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(10) + "," + list.get(6) + "," + list.get(31));
                break;
            }
            case "viserys": {
                System.out.println("Mother: N/A");
                System.out.println("Father: " + list.get(2));
                System.out.println("Spouse: N/A");
                System.out.println("Siblings: N/A");
                System.out.println("Children: " + list.get(20) + "," + list.get(33) + "," + list.get(7));
                break;

            }

        }

    }

}
