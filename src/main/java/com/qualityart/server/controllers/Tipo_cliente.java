/*const express = require('express');
const routes = express.Router();
var {TipoClienteModel} = require('../Models/TipoCliente');
const tipoClienteModel = new TipoClienteModel();
routes.get('/',async (req,res)=>{
    try{
        const tiposCliente = await tipoClienteModel.obtenerTiposClientes();
        res.send(tiposCliente);
    }
    catch(error)
    {
        console.error(error);
        res.status(500).json({ error: 'Error al obtener los productos' });
    }
});

routes.post('/', async (req, res) => {
    try {
        const { nom_tipocliente, des_tipocliente } = req.body;
        const resultado = await tipoClienteModel.insertarTipoCliente(
            [
                nom_tipocliente, 
                des_tipocliente
            ]);
        res.status(201).json({message:'Agregado con exito'});
    } catch (error) {
        console.error(error);
        res.status(500).json({ error: 'Error al insertar el tipo de cliente' });
    }
});

routes.put('/:id', async (req, res) => {
    try {
        const { nom_tipocliente, des_tipocliente } = req.params;
        const resultado = await tipoClienteModel.modificarTipoCliente(
            [
                req.params.id ||null, 
                nom_tipocliente || null, 
                des_tipocliente || null
            ]);
        if (resultado[0].mensaje === 'Tipo de cliente actualizado correctamente.') {
            res.status(201).json({message:'Actualizado con exito'});
        } else {
            res.status(500).json({ error: 'No se pudo actualizar el tipo de cliente' });
        }
    } catch (error) {
        console.error(error);
        res.status(500).json({ error: 'Error al actualizar el tipo de cliente' });
    }
});

module.exports = routes;*/

package com.qualityart.server.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tipocliente")
public class Tipo_cliente {
    @GetMapping
    public String getAcabados() {
        return "Tipos de cliente";
    }
}
