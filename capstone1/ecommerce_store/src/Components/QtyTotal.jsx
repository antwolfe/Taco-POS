import React from "react";

export default function CartTotal(props) {
  const { product, qty } = props;

  const calculateCartTotal = () => {
    //forEach cartItem => calculate bookPrice, accumulate ++ ((reduce)) , return total as render
  };

  return (
    <div>
      <div>
        <div>{product.price * qty}</div>
      </div>
    </div>
  );
}
