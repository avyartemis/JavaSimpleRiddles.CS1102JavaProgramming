import javax.swing.JOptionPane;
public class Quiz {
    public static void main(String[] args) {
        //Create the question
        String question = "Quiz Time You-All-People!\nWhy did Java cross the road?\n";
        //Create the answer options
        question += "A. To get to the other side.\n";
        question += "B. To get Ms Avy Javanese Coffee!\n";
        question += "C. To get everyone Coffee!\n";
        question += "D. To get to the Starbucks & try the 'New Seasonal Flavour!'\n";
        question += "E. To get Nowhere! xD";

        //Do While Loop
        do {
        String answer = JOptionPane.showInputDialog(question);

        answer = answer.toUpperCase();
        if (answer.equals("B"))
        {
            JOptionPane.showMessageDialog(null, "Correct!");
            break;
        }
        else if (answer.equals("A") | answer.equals("C") | answer.equals("D") | answer.equals("E"))
        {
            JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            continue;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E");
            continue;
        }
    }
    while (true);
    }
}

