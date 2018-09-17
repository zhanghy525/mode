package interfacemode.composite;

import java.util.ArrayList;
//组合模式
public class Folder {
    private String name;
    private ArrayList<Folder> floders = new ArrayList<Folder>();
    private ArrayList<ImageFile> imageFiles = new ArrayList<ImageFile>();
    private ArrayList<TextFile> textFiles = new ArrayList<TextFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder floder) {
        floders.add(floder);
    }

    public void addImageFile(ImageFile imageFile) {
        imageFiles.add(imageFile);
    }

    public void addTextFile(TextFile textFile) {
        textFiles.add(textFile);
    }

    public void killVirus() {
        System.out.println("---开始对文件夹" + name + "进行杀毒...");

        for (Folder floder : floders
        ) {
            floder.killVirus();
        }

        for (ImageFile imageFile : imageFiles
        ) {
            imageFile.killVirus();
        }

        for (TextFile textFile : textFiles
        ) {
            textFile.killVirus();
        }

        System.out.println("---结束对文件夹" + name + "进行杀毒...");
    }

}
