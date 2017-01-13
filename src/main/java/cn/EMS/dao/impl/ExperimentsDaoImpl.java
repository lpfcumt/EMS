package cn.EMS.dao.impl;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.ExperimentsDao;
import cn.EMS.model.Experiments;

@Repository("experimentsDao")
public class ExperimentsDaoImpl extends BaseDaoImpl<Experiments> implements ExperimentsDao{

}
