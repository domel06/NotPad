
package texteditor;

import javax.swing.JFrame;

/**
 *
 * @author domelBura
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextEditorGui obj = new TextEditorGui();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
