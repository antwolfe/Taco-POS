import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import QtyTotal from "./QtyTotal";

export default function ModifyQty({ onDelete, product }) {
  const [qty, setQty] = useState(1);

  const maxQty = product.qty;
  const overMaxQty = "Cannot buy more than we have!";

  const increment = () => {
    if (qty < maxQty) {
      setQty(qty + 1);
    } else {
      alert(overMaxQty);
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
        <Button onClick={decrement}>-</Button>
        <input
          className="qty-num"
          type="number"
          value={qty}
          style={{ width: "35px" }}
        />
        <Button onClick={increment}>+</Button>
      </div>
      <div className="cart-total">
        <QtyTotal product={product} qty={qty} />
      </div>
    </div>
  );
}
