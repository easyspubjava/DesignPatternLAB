package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";                         // 현재 주목하고 있는 디렉토리명
   
    public void visit(File file) {                  // 파일을 방문했을 때 호출된다.
        System.out.println(currentdir + "/" + file);
    }
    
    public void visit(Directory directory) {   // 디렉토리를 방문했을 때 호출된다.
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
           // if(entry.getName() == "tmp")
           // 	continue;
            
            entry.accept(this);
            
        }
        currentdir = savedir;
    }
}
