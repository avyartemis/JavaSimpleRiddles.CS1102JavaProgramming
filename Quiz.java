import javax.swing.JOptionPane;
public class Quiz {
    public static void main(String[] args) {
        //Create the question
        String question = "Quiz Time You-All-People!\nWhy did Java cross the road?\n";
        //Create the answer options
        question += "A. To get to the other side.\n";
        question += "B. To get Coffee!";

        //Do While Loop
        do {

        String answer = JOptionPane.showInputDialog(question);

        answer = answer.toUpperCase();
        if (answer.equals("B"))
        {
            JOptionPane.showMessageDialog(null, "Correct!");
            break;
        }
        else if (answer.equals("A"))
        {
            JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            continue;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A or B");
            continue;
        }

    }
    while (true);

    }
}

