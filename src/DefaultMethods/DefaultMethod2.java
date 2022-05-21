package DefaultMethods;

// La principale idée d'une interface est de déclarer des fonctionnalités
// Les méthodes par défault permettent non seulement de déclarer la fonctionnalité mais
// également de l'implementer. The main reason is supporting backward (flexibilité)

// En effet en déclarant une méthode par défault dans une interface ça signifie qu'on a pas à
// l'implementer dans toutes les classes implémentant l'interface

public class DefaultMethod2 implements Movable, Jumpable {
    @Override
    public void jump() {

    }

    @Override
    public void turnLeftJump() {

    }

    @Override
    public void turnRightJump() {

    }

    @Override
    public void stepAhead() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {
    }

    @Override
    public void turnAround() {
        // On déclare spécifiquement qu'on veut l'implémentation de l'interface Movable au lieu de Jumpable
        // On peut également réecrire l'implémentation
        Movable.super.turnAround();
    }
}


/**
 * Ici la méthode par défaut turnAround() est présente dans les deux interfaces, une classe qui implémente les
 * deux interfaces doit soit override la méthode soit appeler l'une des deux implémentations(exemple plus haut)
 */
interface Jumpable {
    void jump();
    void turnLeftJump();
    void turnRightJump();
    default void turnAround() {
        turnLeftJump();
        turnLeftJump();
    }
}
interface Movable {
    void stepAhead();
    void turnLeft();
    void turnRight();

    default void turnAround() {
        turnLeft();
        turnLeft();
    }
}
