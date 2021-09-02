package org.soujava.sandwich;

import javax.money.MonetaryAmount;

class OrderBuilder implements Order.SizeOrder, Order.StyleOrder, Order.StyleQuantityOrder, Order.DrinksOrder,
        Order.DrinksCocktailOrder, Order.DrinksSoftDrinkOrder {

    private final Bread bread;

    private Sandwich sandwich;

    private int quantity;

    private Drink drink;

    private MonetaryAmount total;

    OrderBuilder(Bread bread) {
        this.bread = bread;
    }

    @Override
    public Order.StyleOrder size(Size size) {
        return null;
    }

    @Override
    public Order.StyleQuantityOrder vegan() {
        return null;
    }

    @Override
    public Order.StyleQuantityOrder meat() {
        return null;
    }

    @Override
    public Order.DrinksOrder quantity(int quantity) {
        return null;
    }

    @Override
    public Order.DrinksCocktailOrder softDrink(int quantity) {
        return null;
    }

    @Override
    public Order.DrinksSoftDrinkOrder cocktail(int quantity) {
        return null;
    }

    @Override
    public Checkout noBeveragesThanks() {
        return null;
    }
}
