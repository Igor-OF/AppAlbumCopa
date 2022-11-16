<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form-group">
    <label>Cep:</label>
    <input type="text" class="form-control" placeholder="Insira o cep" value="${endereco.cep}"
           name="endereco.cep">
</div>

<div class="form-group">
    <label>Logradouro:</label>
    <input type="text" class="form-control" placeholder="Insira o logradouro" value="${endereco.logradouro}"
           name="endereco.logradouro">
</div>

<div class="form-group">
    <label>Complemento:</label>
    <input type="text" class="form-control" placeholder="Insira o complemento" value="${endereco.complemento}"
           name="endereco.complemento">
</div>

<div class="form-group">
    <label>Bairro:</label>
    <input type="text" class="form-control" placeholder="Insira o bairro" value="${endereco.bairro}"
           name="endereco.bairro">
</div>

<div class="form-group">
    <label>Localidade:</label>
    <input type="text" class="form-control" placeholder="Insira a localidade" value="${endereco.localidade}"
           name="endereco.localidade">
</div>

<div class="form-group">
    <label>UF:</label>
    <input type="text" class="form-control" placeholder="Insira a uf" value="${endereco.uf}" name="endereco.uf">
</div>
