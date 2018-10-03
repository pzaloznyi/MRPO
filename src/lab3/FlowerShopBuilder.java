package lab3;

import utils.ConsoleUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Consumer;

public class FlowerShopBuilder {
    private BufferedReader bufferedReader = ConsoleUtils.getBufferedReader();
    public void SetupProduct() throws IOException {

        var flower = new FlowerProduct();
        try {
            setField("name", s -> flower.setName(s));
            setField("type", s -> flower.setType(s));
            setField("species", s -> flower.setSpecies(s));
            setField("subspecies", s -> flower.setSubspecies(s));
            setField("price", s -> flower.setPrice(Double.parseDouble(s)));
            setField("quantity", s -> flower.setQuantity(Integer.parseUnsignedInt(s)));
        } catch (FlowerProductException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Illegal format!");
        }
    }

    private void setField(String field, Consumer<String> setter) throws FlowerProductException {
        System.out.println("Enter flower " + field + ": ");

        try {
            setter.accept(bufferedReader.readLine());
        } catch (IOException e) {
            throw new FlowerProductException("Wrong input for field " + field);
        }
    }
}

