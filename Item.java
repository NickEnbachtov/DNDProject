/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testdraganddrop;

/**
 *
 * @author notebook
 */
public class Item {
    private String classFile;
    private String imgFile;
    private String imgPath;    
    
    public Item(String classFile, String imgFile, String imgPath){
        this.classFile = classFile;
        this.imgFile = imgFile;
        this.imgPath = imgPath;
    }

    public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }   

    public String getClassFile() {
        return classFile;
    }

    public void setClassFile(String classFile) {
        this.classFile = classFile;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
