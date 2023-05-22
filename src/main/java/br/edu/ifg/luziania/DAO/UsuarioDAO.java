package br.edu.ifg.luziania.DAO;

import br.edu.ifg.luziania.entity.Usuario;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.management.Query;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Dependent
public class UsuarioDAO {

    @Inject
    EntityManager em;


    public void save(Usuario entity){
        em.persist(entity);
    }

    public Usuario getById(Integer id){
        Query query = em.createQuery("from Usuario where id = :id");
        query.setParameter("id", id);
        return (Usuario) query.getSingleStr
    }

}
