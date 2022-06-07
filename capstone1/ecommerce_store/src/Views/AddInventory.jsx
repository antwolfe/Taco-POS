import { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import Form from "react-bootstrap/Form";

const [newTitle, setNewTitle] = useState("");
const [newAuthor, setNewAuthor] = useState("");
const [newPrice, setNewPrice] = useState("");
const [newCover, setNewCover] = useState("");

const handleAddInventory = () => {};
export default function AddInventory() {
  return (
    <div>
      <Form className="add-inventory" onSubmit={handleAddInventory}>
        <Form.Group className="mb-3" controlId="formBasicText">
          <Form.Label>Book Name</Form.Label>
          <Form.Control type="text" placeholder="Enter Title" />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicAuthor">
          <Form.Label>Author</Form.Label>
          <Form.Control type="text" placeholder="Stephen King" />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicPrice">
          <Form.Label>Price</Form.Label>
          <Form.Control type="number" placeholder="$..." />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicCheckbox">
          <Form.Check type="file" label="Add Image File" />
        </Form.Group>

        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Form>
    </div>
  );
}
