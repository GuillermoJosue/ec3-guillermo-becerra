package ec3guillermobecerra.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import añadidos
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "instrumento")
public class Instrumento {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)

  private Integer id;
  private String nombre;

  //vinculando Categoria

  @ManyToOne(cascade=CascadeType.ALL)
  @JoinColumn(name = "id_categoria")
  private Categoria categoria;

  public Categoria getCategoria() {
      return categoria;
  }

  public void setCategoria(Categoria categoria) {
      this.categoria = categoria;
  }

  //fin de vinculacion


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


}
