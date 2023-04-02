package sn.esmt.OffreEmploye.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tablecv")


public class CvEntities {
    @Id //JPA est clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id devient autoIncrement et dans l'ordre
    private int id;
    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 150, nullable = false)
    private String prenom;
    @Column(length = 150, nullable = false)
    private int age;
    @Column(length = 150, nullable = false, unique = true)
    private String adresse;
    @Column(length = 150, nullable = false, unique = true)
    private String email;
    @Column(length = 150, nullable = false)
    private String telephone;
    @Column(length = 150, nullable = false)
    private String specialite;
    @Column(length = 150, nullable = false)
    private String niveauEtude;
    @Column(length = 150, nullable = false)
    private String experienceProfessionnelle;


}