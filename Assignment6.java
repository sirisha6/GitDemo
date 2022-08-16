import java.util.*;
public class Assignment6 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> bookData = new HashMap<>();
        bookData.put("Panchatantra", new ArrayList<>());
        bookData.get("Panchatantra").add(1.0); //bookprn number
        bookData.get("Panchatantra").add(100.0); //price
        bookData.get("Panchatantra").add(5.0); //quantity
        bookData.put("Ikigai", new ArrayList<>());
        bookData.get("Ikigai").add(2.0); //bookprn number
        bookData.get("Ikigai").add(100.0); //price
        bookData.get("Ikigai").add(2.0); //quantity
        bookData.put("Alchemist", new ArrayList<>());
        bookData.get("Alchemist").add(3.0); //bookprn number
        bookData.get("Alchemist").add(100.0); //price
        bookData.get("Alchemist").add(3.0); //quantity
        bookData.put("MindPower", new ArrayList<>());
        bookData.get("MindPower").add(4.0); //bookprn number
        bookData.get("MindPower").add(100.0); //price
        bookData.get("MindPower").add(1.0); //quantity
        for(Map.Entry<String,ArrayList<Double>> entry : bookData.entrySet()) {
            System.out.println(
                    "BookName : " + entry.getKey() +
                            " prn number : " +entry.getValue().get(0) +
                            " price : " +entry.getValue().get(1) +
                            " Quantity : " +entry.getValue().get(2)
            );
        }



        ArrayList<String> cartList = new ArrayList<>();
        cartList.add("Ikigai");
        cartList.add("MindPower");
        cartList.add("abc");
        double totalPrice = 0.0;
        for (int cartListIterator = 0; cartListIterator < cartList.size(); cartListIterator++) {
            if (bookData.containsKey(cartList.get(cartListIterator))) {
                if (bookData.get(cartList.get(cartListIterator)).get(2) != 0) {
                    double price = bookData.get(cartList.get(cartListIterator)).get(1);
                    totalPrice += price;
                    double currentQuantity = bookData.get(cartList.get(cartListIterator)).get(2);
                    bookData.get(cartList.get(cartListIterator)).remove(2);
                    bookData.get(cartList.get(cartListIterator)).add(currentQuantity - 1);
                } else {
                    System.out.println(cartList.get(cartListIterator) + " : Out of Stock");
                }
            }
            else {
                System.out.println(cartList.get(cartListIterator) + " : Out of Stock");
            }

        }

        System.out.println("Price : "+totalPrice);
        for(Map.Entry<String,ArrayList<Double>> entry : bookData.entrySet()) {
            System.out.println(
                    "BookName : " + entry.getKey() +
                            " prn number : " +entry.getValue().get(0) +
                            " price : " +entry.getValue().get(1) +
                            " Quantity : " +entry.getValue().get(2)
            );
        }


    }
}