FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
  file://10-ipv4-routing.conf \
"

do_install_append() {
  install -m 0644 ${WORKDIR}/10-ipv4-routing.conf ${D}${sysconfdir}/sysctl.d/
}
