class RoomCarpet 
{
RoomDimension size;
int carpetCost;
public RoomCarpet(RoomDimension dim, int cost)
{
size = new RoomDimension(dim.getLength(), dim.getWidth());
carpetCost = cost;
}
public int getTotalCost()
{
return carpetCost;
}
public String toString()
{
return size + "\nCarpet cost: $" + carpetCost * size.getArea();

}
}