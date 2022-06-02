import React, { useState } from "react";
import inventoryData from "../inventory.json";
import ProductPreview from "./ProductPreview";
import ProductsPage from "./ProductsPage";

export default function ParseInventory() {
  const bookList = inventoryData.map((book, i) => {
    <ProductsPage books={book} />;
    // <ProductPreview key={i} title={book.title} price={book.price} />;
  });

  //create inventory component and use as parent for rest of components?

  return <div>{bookList}</div>;
}
