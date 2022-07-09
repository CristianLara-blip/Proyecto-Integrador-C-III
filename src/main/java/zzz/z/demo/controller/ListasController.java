/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.controller;

import com.example.plan.util.reportes.OrganizacionesExportarEXCEL;
import com.example.plan.util.reportes.OrganizacionesExportarPDF;
import zzz.z.demo.entity.Organizaciones;
import zzz.z.demo.serviceImpl.OrganizacionesService;
import com.lowagie.text.DocumentException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alarc
 */
@Controller
@RequestMapping("/lista")
public class ListasController {

    @Autowired
    private OrganizacionesService organizacionesService;

    @GetMapping("/all")
    public String listarCate(org.springframework.ui.Model model) {
        model.addAttribute("organizaciones", organizacionesService.readAll());
        return "lista";
    }

    @GetMapping("/exportarPDF")
    public void exportarListadoDeEmpleadosEnPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=OrganizacionesSociales_" + fechaActual + ".pdf";

        response.setHeader(cabecera, valor);

        List<Organizaciones> organizaciones = organizacionesService.readAll();

        OrganizacionesExportarPDF exporter = new OrganizacionesExportarPDF(organizaciones);
        exporter.exportar(response);
    }

    @GetMapping("/exportarExcel")
    public void exportarListadoDeEmpleadosEnExcel(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=OrganizacioneSociales_" + fechaActual + ".xlsx";

        response.setHeader(cabecera, valor);
        List<Organizaciones> libros = organizacionesService.readAll();
        OrganizacionesExportarEXCEL exporter = new OrganizacionesExportarEXCEL(libros);
        exporter.exportar(response);

    }
}
