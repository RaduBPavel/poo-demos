package main.factory;

public class FurnitureFactory {
    public Furniture createFurniture(String furnitureType) {
        switch (furnitureType) {
            case "chair":
                return new Chair("alb", 10);
            case "table":
                return new Table("alb", 10);
            case "bed":
                return new Bed("alb", 10);
            case "wardrobe":
                return new Wardrobe("alb", 10);
            case "toilet":
                return new Toilet("alb", 10);
            default:
                return null;
        }
    }
}
