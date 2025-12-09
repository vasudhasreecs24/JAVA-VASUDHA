lass SwingDemo {
    SwingDemo() {

        // Create JFrame container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(300, 200);
        jfrm.setLayout(new FlowLayout());

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Heading label
        JLabel jlab = new JLabel("Enter the numbers:");

        // Text fields
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);

        // Button
        JButton button = new JButton("Calculate");

        // Labels for output and errors
        JLabel err = new JLabel();
        JLabel alab = new JLabel();
        JLabel blab = new JLabel();
        JLabel anslab = new JLabel();

        // Add components in order
        jfrm.add(jlab);
        jfrm.add(ajtf);
        jfrm.add(bjtf);
        jfrm.add(button);
        jfrm.add(err);
        jfrm.add(alab);
        jfrm.add(blab);
        jfrm.add(anslab);

        // Button action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());

                    int ans = a / b;

                    err.setText("");
                    alab.setText("A = " + a);
                    blab.setText("B = " + b);
                    anslab.setText("Ans = " + ans);
                }
                catch (NumberFormatException e) {
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("Enter Only Integers!");
                }
                catch (ArithmeticException e) {
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("B should be NON zero!");
                }
            }
        });

        // Display frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        // Create frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
