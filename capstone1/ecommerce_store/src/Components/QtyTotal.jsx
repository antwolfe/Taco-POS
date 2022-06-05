import React, { useEffect, useState } from "react";
import CartTotal from "./CartTotal";

export default function QtyTotal(props) {
  const { product, qty } = props;
  const purchasePrice = (product.price * qty).toFixed(2);

  return (
    <div>
      <div>
        <p>{purchasePrice}</p>
      </div>
    </div>
  );
}
