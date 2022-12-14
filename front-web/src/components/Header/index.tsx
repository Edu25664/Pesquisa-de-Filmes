import "./style.css";
import { ReactComponent as Logo } from "../../assets/Vector.svg";
const Header = () => (
  <header className="main-header">
    <Logo className="logo-text"></Logo>
    <div className="logo-text">
      <span className="logo-text-1">Big Game</span>
      <span className="logo-text-2"> Survey</span>
    </div>
  </header>
);

export default Header;
