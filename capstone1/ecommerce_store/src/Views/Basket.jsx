import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";

export default function Basket(props) {
  const { cartItems, setCartItems, products } = props;

  const id = products.map((product) => product.id);

  console.log(cartItems);

  //verify item
  // const isProduct = () => {
  //   if (id.find((item) => item === cartItems.id)) {
  //     return true;
  //   }
  // };

  //Add Item, keep Cart State
  const addItem = () => {
    if (cartItems) {
      console.log("add whole object to empty cart");
      setCartItems(cartItems);
    } else {
      addNewItem();
    }
  };

  const addNewItem = () => {
    console.log("add object to existing cart");
    // setCart({
    //   cart: [cartItems],
    // });
    // return;
  };

  // setCart((cart) => ({
  //   cart: [...cart, cartItems.title],
  // }));
  //     }
  //   }
  // };

  const setQty = () => {};

  const checkDuplicates = () => {};

  const isCartEmpty = () => {
    return cartItems.length == 0;
  };

  return (
    <div>
      <h2> Cart Items </h2>
      {isCartEmpty() ? (
        <div>Cart is empty</div>
      ) : (
        // cartItems.map((product) => {
        <CartItem book={cartItems} />
        // })
      )}
      <Button variant="primary">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}

//     return (
//       <div>
//         Added to Cart
//         {/* <div>{cartItems.title}</div>
//         <div>{cartItems.price}</div> */}
//       </div>
//     );
//   }
// };

// const onAdd = (product) => {
//   const exist = cartItems.find((item) => item.id == product.id);
//   if (exist) {
//     console.log("exists");
//     // setCartItems(
//     //   cartItems.map(
//     //     (item =
//     //       item.id == product.id ? { ...exist, qty: exist.qty + 1 } : item)
//     //   )
//     // );
//   } else {
//     setCartItems([...cartItems, { ...product, qty: 1 }]);
//   }
// };
//   <div>
//     {cartItems.map((item) => {
//       <div key={item.id}>
//         <div>{item.name}</div>
//         <div>
//           <Button onClick={() => onAdd(item)}>Add 1</Button>
//         </div>
//       </div>;
//     })}
//   </div>
// }

// console.log(cartItems);
