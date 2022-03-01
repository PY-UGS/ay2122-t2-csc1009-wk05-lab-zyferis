import java.util.Date;

public abstract class GeometricObject {
    private String colour;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        colour = "White";
        filled = false;
        dateCreated = new Date();
    }

    public GeometricObject(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + " color: " + colour + " and filled: " + filled;
    }

}
