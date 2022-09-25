import "./style.css";
import { ReactComponent as Seta } from "../../assets/Seta.svg";
import { ReactComponent as Image } from "../../assets/GAMER.svg";
import { ReactComponent as Back } from "../../assets/Back.svg";
function Home() {
  return (
    <div className="home-container">
      <div className="home-text">
        <h1 className="home-text-title">Quais jogos você mais gosta?</h1>
        <h3 className="home-text-subtitle">
          Clique no botão abaixo e saiba quais são os jogos que os gamers estão
          escolhendo!
        </h3>
        <div className="home-actions">
          <button className="home-btn">QUERO SABER QUAIS SÃO</button>
          <div className="home-btn-icon">
            <Seta />
          </div>
        </div>
      </div>

      <Image className="home-image"></Image>
    </div>
  );
}

export default Home;
