import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartTotal from "./CartTotal";

export default function ModifyQty({ onDelete, product, cartItems }) {
  const currentItemsQty = cartItems.map((item) => {
    console.log(item.qty);
    return item.qty;
  });

  const [itemQty, setItemQty] = useState(currentItemsQty);

  console.log(itemQty);

  const maxQty = product.inventory;
  const overMaxQty = "SOLD OUT!";

  const increment = () => {
    if (itemQty < maxQty) {
      setItemQty(itemQty + 1);
    } else {
      alert(overMaxQty);
    }
  };

  const decrement = () => {
    if (itemQty > 0) {
      setItemQty(itemQty - 1);
    } else {
      onDelete(product);
    }
  };

  const eachItemQty = () => {
    itemQty.map((item) => {});
  };

  return (
    <div>
      <div className="counter">
        <Button onClick={decrement}>-</Button>
        <input
          className="qty-num"
          type="number"
          value={itemQty}
          onChange={() => {
            return itemQty;
          }}
          style={{ width: "35px" }}
        />
        <Button onClick={increment}>+</Button>
      </div>
      <div>{(product.price * itemQty).toFixed(2)}</div>
      <div></div>
    </div>
  );
}
