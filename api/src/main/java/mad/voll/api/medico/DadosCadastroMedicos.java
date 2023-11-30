package mad.voll.api.medico;

import mad.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
