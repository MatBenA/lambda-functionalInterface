package proyecto.lambda.interfaces;

import java.util.ArrayList;

@FunctionalInterface
public interface Transformador {
    ArrayList<String> stringToUpperCase(ArrayList<String> listaPalabras);
}
