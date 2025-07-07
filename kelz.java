import java.util.Random;

public class LoveGenerator {
    public static void main(String[] args) {
        String[] messages = {
            "i hope you're having a calm and peaceful day.",
            "you’re doing your best — and that’s enough.",
            "some days are slow, and that's okay.",
            "you matter, even when you feel unnoticed.",
            "you bring something valuable to this world."
        };

        Random rand = new Random();
        int index = rand.nextInt(messages.length);
        System.out.println(messages[index]);
    }
}
