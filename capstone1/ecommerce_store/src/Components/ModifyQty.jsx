import React, { useState, useEffect } from "react";
import Button from "react-bootstrap/esm/Button";
import CartTotal from "./CartTotal";

export default function ModifyQty({ onDelete, product, cartItems }) {
  const [qty, setQty] = useState(1);
  console.log(product);
  const maxQty = product.qty;
  console.log(qty);

  const increment = () => {
    if (qty < maxQty) {
      setQty(qty + 1);
    } else {
      console.log(maxQty);
      console.log(qty);
      // alert("Cannot buy more than we have!");
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
//   const currQty = product.qty;

//   console.log(currQty);

//   console.log(cartItems);
//   // console.log(itemQty);

//   const maxQty = product.inventory;

//   const overMaxQty = "SOLD OUT!";

//   const increment = () => {
//     cartItems.map((product) => {
//       if (product.qty <= maxQty) {
//         product.qty += 1;
//         return currQty;
//         window.location.reload(false);
//       } else {
//         console.log("too many!!");
//         // alert(overMaxQty);
//       }
//     });
//   };

//   const decrement = () => {};
//   //   if (itemQty > 0) {
//   //     setItemQty(itemQty - 1);
//   //   } else {
//   //     onDelete(product);
//   //   }
//   // };

//   // const eachItemQty = () => {
//   //   itemQty.map((item) => {});
//   // };

//   return (
//     <div>
//       <div className="counter">
//         <Button onClick={decrement}>-</Button>
//         <input
//           className="qty-num"
//           type="number"
//           value={currQty}
//           onChange={() => {
//             return currQty;
//           }}
//           style={{ width: "35px" }}
//         />
//         <Button onClick={increment}>+</Button>
//       </div>
//       {/* <div>{(product.price * itemQty).toFixed(2)}</div> */}
//       <div></div>
//     </div>
//   );
// }
