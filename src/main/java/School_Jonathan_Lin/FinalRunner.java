package School_Jonathan_Lin;

public class FinalRunner {

    public static void main(String[] args) {
        Final f = new Final();

        int correct = 0;
// Tests for all sort problems
        int[][] sorttest = {
            {3, 9, 5, 7, 4, 1},
            {13, 49, 75, -37, 14, 81},
            {-3, -9, -5, -7, -4, -1}};

        int[][] sortanswer = {
            {1, 3, 4, 5, 7, 9},
            {-37, 13, 14, 49, 75, 81},
            {-9, -7, -5, -4, -3, -1}};
// Tests for the list reverse
        int[][] revtest = {
            {13, 49, 75, -37, 14, 81},
            {-3, -9, -5, -7, -4, -1}};

        int[][] revanswer = {
            {81, 14, -37, 75, 49, 13},
            {-1, -4, -7, -5, -9, -3}};
// Tests for the number to name
        int[] n2ntest = {3, 9, 10};

        String[] n2nanswer = {"three", "nine", "ten"};
// Tests for the base 10 to binary (leading zero's are optional
        int[] b10btest = {17, 234, 18573};

        String[] b10banswer1 = {"00010001", "11101010", "0100100010001101"};
        String[] b10banswer2 = {"10001", "11101010", "100100010001101"};
// Test sortArray
        for (int x = 0; x <= 2; x++) {
            boolean ok = true;
            int[] ans = f.sortArray(sorttest[x]);
            if (ans.length == sortanswer[x].length) {
                for (int i = 0; i < sortanswer[x].length; i++) {
                    if (ans[i] != sortanswer[x][i]) {
                        ok = false;
                    }
                }
            } else {
                ok = false;
            }
            if (ok) {
                System.out.println("sortArray test " + x + " correct");
                correct++;
            } else {
                System.out.println("sortArray test " + x + " not correct");
            }
        }
// Test sortArraywithSet
        for (int x = 0; x <= 2; x++) {
            boolean ok = true;
            int[] ans = f.sortArraywithSet(sorttest[x]);
            if (ans.length == sortanswer[x].length) {
                for (int i = 0; i < sortanswer[x].length; i++) {
                    if (ans[i] != sortanswer[x][i]) {
                        ok = false;
                    }
                }
            } else {
                ok = false;
            }
            if (ok) {
                System.out.println("sortArraywithSet test " + x + " correct");
                correct++;
            } else {
                System.out.println("sortArraywithSet test " + x + " not correct");
            }
        }
// Test NumtoName
        for (int x = 0; x <= 2; x++) {
            if (f.numtoName(n2ntest[x]).equals(n2nanswer[x])) {
                System.out.println("NumtoName test " + x + " correct");
                correct++;
            } else {
                System.out.println("NumtoName test " + x + " not correct");
            }
        }
// Test base10toBinary
        for (int x = 0; x <= 2; x++) {
            if (f.base10toBinary(b10btest[x]).equals(b10banswer1[x]) || f.base10toBinary(b10btest[x]).equals(b10banswer2[x])) {
                System.out.println("base10toBinary test " + x + " correct");
                correct++;
            } else {
                System.out.println("base10toBinary test " + x + " not correct");
            }
        }
// Test ReversewithStack
        for (int x = 0; x <= 1; x++) {
            boolean ok = true;
            int[] ans = f.reversewithStack(revtest[x]);
            if (ans.length == revanswer[x].length) {
                for (int i = 0; i < revanswer[x].length; i++) {
                    if (ans[i] != revanswer[x][i]) {
                        ok = false;
                    }
                }
            } else {
                ok = false;
            }
            if (ok) {
                System.out.println("ReversewithStack test " + x + " correct");
                correct++;
            } else {
                System.out.println("ReversewithStack test " + x + " not correct");
            }
        }

        System.out.println(
                "Correct Answers: " + correct);
        int wrong = 14 - correct;

        System.out.println(
                "Wrong Answers: " + wrong);
    }

}
