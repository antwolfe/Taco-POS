import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";

export default function ModifyQty({ onDelete, product }) {
  const [itemQty, setItemQty] = useState(1);

  const maxQty = product.qty;
  const overMaxQty = "Cannot buy more than we have!";

  const increment = () => {
    let amount = 0;
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
    </div>
  );
}
