class RoomDimension
{
int length;
int width;
public RoomDimension(int len, int w)
{
length = len;
width = w;
}
public int getLength()
{
return length;
}
public int getWidth()
{
return width;
}
public int getArea()
{
return length * width;
}
public String toString()
{

 return "Room dimensions:\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea()  + " Sq ft";

}
}