package cc.oobootcamp.principle.lsp;

public class Square extends Rectangle {
    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(double width) {
        this.height = width;
        this.width = width;
    }
}
