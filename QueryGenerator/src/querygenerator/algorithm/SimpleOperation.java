/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querygenerator.algorithm;

/**
 *
 * @author daniellucredio
 */
public class SimpleOperation extends Operation {

    public SimpleOperation(String text, ComputedEntity result) {
        super(text, result);
    }

    @Override
    public String toString() {
        String ret = "";
        ret += text + "\n";
        ret += "Entidade Computada: ";
        if (result != null) {
            ret += result.toString() + "\n";
        } else {
            ret += "null\n";
        }
        return ret;
    }

}
