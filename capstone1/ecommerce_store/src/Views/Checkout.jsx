import Button from "react-bootstrap/esm/Button";
import { useNavigate } from "react-router-dom";

export default function Checkout() {
  const checkoutMessage = (e) => {
    alert("Your Order Has Been Submitted");
  };

  return (
    <div>
      <div className="checkout">
        <div className="checkout-header">
          <form
            action=""
            onSubmit={(e) => {
              checkoutMessage(e);
            }}
          >
            <h1 className="text-center">CheckOut</h1>
            <h2>Payment Information</h2>

            <div className="leftside">
              <p>Cardholder Name</p>
              <input type="text" className="inputbox" name="name" required />
              <p>Email</p>
              <input type="text" className="inputbox" name="email" required />
              <p> Address </p>
              <input type="text" className="inputbox" name="address" required />
              <p> City </p>
              <input type="text" className="inputbox" name="city" required />
              <p> State </p>
              <input type="text" className="inputbox" name="state" required />
              <p> Zip Code </p>
              <input
                type="number"
                className="inputbox"
                name="zip code"
                required
              />

              <div className="rightside">
                <p>Card Number</p>
                <input
                  type="number"
                  className="inputbox"
                  name="card_number"
                  id="card_number"
                  required
                />
                <p>Card Type</p>
                <select
                  className="inputbox"
                  name="card_type"
                  id="card_type"
                  required
                >
                  <option value="">--Select a Card Type--</option>
                  <option value="Visa">Visa</option>
                  <option value="MasterCard">MasterCard</option>
                </select>
                <div className="expcvv">
                  <p className="expcvv_text">Expiry</p>
                  <input
                    type="date"
                    className="inputbox"
                    name="exp_date"
                    id="exp_date"
                    required
                  />
                  <p className="expcvv_text2">CVV</p>
                  <input
                    type="password"
                    className="inputbox"
                    name="cvv"
                    id="cvv"
                    required
                  />
                </div>
              </div>
            </div>
            <p></p>
            <Button type="submit" className="button">
              PURCHASE ORDER
            </Button>
          </form>
        </div>
      </div>
    </div>
  );
}
