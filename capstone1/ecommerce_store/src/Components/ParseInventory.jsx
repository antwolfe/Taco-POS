import React, { useState } from "react";
import inventoryData from "../inventory.json";
import ProductPreview from "./ProductPreview";

export default function ParseInventory() {
  const bookList = inventoryData.map((book, i) => {
    return <ProductPreview key={i} title={book.title} price={book.price} />;
  });

  /* const getProductDetails = inventoryData.map((book, i) => {
    return <ProductPage><ProductPreview> details={} </ProductPage>
  } */

  //create inventory component and use as parent for rest of components?

  return <div>{bookList}</div>;
}
