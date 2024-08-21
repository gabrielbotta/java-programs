package filedemonstration;

import javax.swing.JOptionPane;
import java.io.File;

public class FileDemonstrationJO {

    public static void main(String[] args) {
        String path = JOptionPane.showInputDialog("Digite o nome do diretório:");
        analyzePath(path);
    }

    public static void analyzePath(String path) {
    File name = new File(path);
        if (name.exists()) {
            String message = String.format("%s exists\n%s\n%s\nLast modified: %s\nLenght: %s\npath: %s\nParent: %s",
                name.getName(),
                (name.isFile() ? "is a file" : "is not a file"),
                (name.isDirectory() ? "is a directory" : "is not absolute path"),
                name.lastModified(), name.length(),
                name.getPath(), name.getParent());

            if (name.isDirectory()) {
                String[] directory = name.list();
                message += "\n\nDirectory contents:\n";

                for (String directoryName : directory) {
                    message += directoryName + "\n";
                }
            }

            // Exibir a mensagem com um título personalizado
            JOptionPane.showMessageDialog(null, message, "File Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, path + " does not exist.");
        }
    }
}
