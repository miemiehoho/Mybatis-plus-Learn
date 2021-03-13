package edu.gdut.learn.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author miemiehoho
 * @since 2021-03-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer category;

    private Integer count;

    private String description;

    private Long userId;


}
