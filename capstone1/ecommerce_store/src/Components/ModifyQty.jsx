import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";

export default function ModifyQty({ onDelete, product }) {
  const [qty, setQty] = useState(1);
  const maxQty = product.qty;

  const increment = () => {
    if (qty < maxQty) {
      setQty(qty + 1);
    } else {
      alert("Cannot buy more than we have!");
    }
  };

  const decrement = () => {
    if (qty > 0) {
      setQty(qty - 1);
    } else {
      onDelete(product);
    }
  };

  return (
    <div>
      <div className="counter">
        <Button onClick={increment}>+</Button>
        <input
          className="qty-num"
          type="number"
          value={qty}
          style={{ width: "35px" }}
        />
        <Button onClick={decrement}>-</Button>
      </div>
    </div>
  );
}
