package SearchAllFilesInAPathAndSub;

import Processes.ProcessSingleFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class RecursiveFileSearchNoNumbered extends ProcessSingleFile {
    private String string_to_search;
    private Set<String> check;
    ArrayList<String> total_size= new ArrayList<>();

    public RecursiveFileSearchNoNumbered() {
    }

    public RecursiveFileSearchNoNumbered(String file_Path,String string_to_search) {
        super(file_Path);
        this.string_to_search = string_to_search;
    }

    public Set<String> search(boolean noVerbose,String ext) throws IOException {
        this.check = super.searchRecursive(string_to_search,noVerbose,ext);
        return check;
    }

    public long getTotalFileSize(String ext) throws IOException {
        return super.getFileSizeMultipleRecursiveAndNot(ext,false);
    }
}
