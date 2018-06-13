package at.fhv.ooa.wdu.patterns.state;

public class StatePattern {

    /*
 Context
*/
    class File{
        FileState state;
        public void setState(FileState s){
            state = s;
        }
        public void readContents(){
            state.read(this);
        }
    }
    /*
     State
    */
    interface FileState{
        void read(File context);
    }
    /*
     Specific state
    */
    class OpenState implements FileState{
        public void read(File context){
            // read file contents
            context.setState(this);
        }
    }
    class ClosedState implements FileState{
        public void read(File context){
            // throw error
            context.setState(this);
        }
    }
    /*
     Client usage
    */
    public class FileHandler{
        File fileHandle;
        public File openFile(String path){
            fileHandle = new File();
            OpenState open = new OpenState(fileHandle);
            return fileHandle;
        }

        public void closeFile(){
            ClosedState closed = new ClosedState(fileHandle);
        }
    }

    public static void main(String[] args) {
        File myFile = FileHandler.openFile("sth");
        myFile.readContents(); // reads content
        closeFile();
        myFile.readContents(); // throws error
    }
}
