package sn.esmt.OffreEmploye.ws;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiLoginResponse {
    private String message;
    private String email;
}