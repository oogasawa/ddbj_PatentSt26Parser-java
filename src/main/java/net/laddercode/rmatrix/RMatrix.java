package net.laddercode.rmatrix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toCollection;

public class RMatrix<T> {

    Collection<T> list = null;
    int columnSize = 0;
    int rowSize = -1;


    public RMatrix() {
        this.columnSize = 0;
        this.rowSize = 0;

        list = new ArrayList<T>();

    }

    public RMatrix(int columnSize) {
        this.columnSize = columnSize;
        this.rowSize = 1;

        list = new ArrayList<T>();
    }


    public RMatrix(int columnSize, int rowSize) {
        this.columnSize = columnSize;
        this.rowSize = rowSize;
    }


    public RMatrix(List<T> list, int columnSize, int rowSize) {
        this.list = list;
        this.columnSize = columnSize;
        this.rowSize = rowSize;
    }



}
