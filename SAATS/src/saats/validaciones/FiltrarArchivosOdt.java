/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sri.validaciones;

import java.io.File;
import javax.swing.filechooser.*;


/**
 *
 * @author jack
 */
public class FiltrarArchivosOdt extends FileFilter{
     public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Extensiones.getExtension(f);
        if (extension != null) {
            if (extension.equals(Extensiones.odt)) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }

    //The description of this filter
    public String getDescription() {
        return "Archivos de OpenOffice Documento de Texto (*.odt)";
    }

    @Override
    public String toString() {
        return "."+Extensiones.odt;
    }
}
