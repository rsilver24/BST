// Roan Silver      Created: February 5, 2024        Last Edits: February 6, 2024
public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();

        /** To test this BST, I will be using the same variables as the HashTables driver in order to test return and put values.
         * The values of these can be found below:
         *
         * Keys:
         * "Hey!", "How are you?", "but like... I don't want to go >:(", "157382", "!@#$%^&*()", and "A".
         *
         * Values:
         * "Hi!", "I'm doing alright", "but you HAVE to go!", "wow those sure are numbers", "I don't really understand but yeah!", and "B".
         */

        // Initial size test (0)

        System.out.print("initial size test (should print '0'): ");
        System.out.println(BST.size());

        System.out.println();


        // Initial isEmpty test

        System.out.print("initial isEmpty test (should print 'true'): ");
        System.out.println(BST.isEmpty());

        System.out.println();

        // Put tests

        BST.put("Hey!", "Hi!");
        BST.put("How are you?", "I'm doing alright");
        BST.put("but like... I don't want to go >:(", "but you HAVE to go!");
        BST.put("157382", "wow those sure are numbers");
        BST.put("!@#$%^&*()", "i don't really understand but yeah!");
        BST.put("A", "B");

        // Peak size test

        System.out.print("peak size test (should print '6'): ");
        System.out.println(BST.size());

        System.out.println();

        // Peak isEmpty test

        System.out.print("peak isEmpty test (should print 'false'): ");
        System.out.println(BST.isEmpty());

        System.out.println();

        // Get method test

        System.out.println("get method tests:");
        System.out.println("Key: 'Hey!' — Value (should be 'Hi!'): " + BST.get("Hey!"));
        System.out.println("Key: 'How are you?' — Value (should be 'I'm doing alright'): " + BST.get("How are you?"));
        System.out.println("Key: 'but like... I don't want to go >:(' — Value (should be 'but you HAVE to go!'): " + BST.get("but like... I don't want to go >:("));
        System.out.println("Key: '157382' — Value (should be 'wow those sure are numbers'): " + BST.get("157382"));
        System.out.println("Key: '!@#$%^&*()' — Value (should be 'i don't really understand but yeah!'): " + BST.get("!@#$%^&*()"));
        System.out.println("Key: 'A' — Value (should be 'B'): " + BST.get("A"));

        System.out.println();

        // Min method test

        System.out.print("min method test (should print 'A'): ");
        System.out.println(BST.min());

        System.out.println();

        // Max method test

        // Because I am unsure how this particular hashCode function is coded, I have no way of knowing if this is valid.
        // However, since these characters are VERY strange in general nature, it would make sense for the hashCode
        // function to place this far on the right side, so we can assume that it is working as intended.
        System.out.print("max method test (should print '!@#$%^&*()'): ");
        System.out.println(BST.max());
    }
}
