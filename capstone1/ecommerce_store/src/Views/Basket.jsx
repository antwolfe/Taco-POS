import React, { useState, useEffect } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";
import CartTotal from "../Components/CartTotal";

export default function Basket(props) {
  const [cartTotal, setCartTotal] = useState(0);
  const [itemQty, setItemQty] = useState(1);

  const { cartItems, onDelete } = props;

  return (
    <div>
      <h2 className="text-center"> Cart Items </h2>
      <div className="cart">
        {cartItems.map((item) => {
          return (
            <div key={item.id}>
              <CartItem
                product={item}
                onDelete={onDelete}
                cartItems={cartItems}
                itemQty={itemQty}
                setItemQty={setItemQty}
              />
            </div>
          );
        })}
        <div className="modify-qty"></div>
        <div className="cart-total text-center">
          <CartTotal cartItems={cartItems} qty={itemQty} />
        </div>
        <div className="d-grid gap-2 login-btn">
          <Button variant="dark" size="lg" className="cart-checkout-btn">
            CHECKOUT
          </Button>
        </div>
      </div>
    </div>
  );
}
